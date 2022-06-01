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
    data.forEach(({id:{videoId},snippet:{title},snippet:{channelTitle}}) => {
        let div=document.createElement('div');

        let iframe=document.createElement('iframe');
        iframe.src=`https://www.youtube.com/embed/${videoId}`;
        // iframe.addEventListener('click',function(){
        //     goToDetails();
        // })
        let h3=document.createElement('h3');
        h3.innerText=title;

        let p=document.createElement('p');
        p.innerText=channelTitle;

        div.append(iframe,h3,p);
        document.getElementById('YouTube').append(div)
              
    });
}

// function goToDetails(){
//     console.log("yes");
// }