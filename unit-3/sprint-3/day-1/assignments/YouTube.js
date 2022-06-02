const api_key='AIzaSyBW8euR4NVbS2Gtz7fylV-mCHDzxFSlbgY';
let search=async ()=>{
    try {
    let query=document.getElementById('query').value;
    let res=await fetch(`https://youtube.googleapis.com/youtube/v3/search?part=snippet&maxResults=20&q=${query}&&key=${api_key}`);
    let data=await res.json();
    append(data.items);
    } catch (error) {
        console.log('error',error);
    }
}

let append=(data)=>{
    document.getElementById('query').value="";
    data.forEach(({id:{videoId},snippet:{title},snippet:{channelTitle},snippet:{thumbnails}}) => {
        let div=document.createElement('div');

        let h3=document.createElement('h3');
        h3.innerText=title;

        let p=document.createElement('p');
        p.innerText=channelTitle;

        let img=document.createElement('img');
        img.src=thumbnails.default.url;
        img.addEventListener('click',function(){

        let iframe=`https://www.youtube.com/embed/${videoId}`;

            goToDetails(iframe,title,channelTitle);
        })

        div.append(img,h3,p);

        document.getElementById('YouTube').append(div)
              
    });
}

function goToDetails(iframe,channelTitle,title){
    let arr=[];
    let obj={
        iframe,
        title,
        channelTitle
    };
    arr.push(obj);
    localStorage.setItem('YouTube',JSON.stringify(arr));
    window.location.href='YouTube_Result.html'
}