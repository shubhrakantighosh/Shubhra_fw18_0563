dataShow=async(query)=>{
    try {
    let key="kCjd1O7nAqnyFVCYI99h4k2lvJ97t7Yi0IxlWkIe_Wc";
    let url=await fetch(`https://api.unsplash.com/search/photos/?query=${query}&per_page=20&client_id=${key}`);
    let getData=await url.json();
    return getData.results;
    } catch (error) {
            
    }
} 

searchImages=async()=>{
    let query=document.getElementById('searchImage').value;
    let data=await dataShow(query);
    showImages(data);
}

selectTarget=async(query)=>{
    let data=await dataShow(query);
    showImages(data);
}

showImages=(data)=>{
    document.getElementById('showImages').innerHTML="";
    data.forEach(({alt_description,urls:{small}}) => {
    let div=document.createElement('div');

    let h3=document.createElement('h3');
    h3.innerText=alt_description;

    let image=document.createElement('img');
    image.src=small;
        
    div.append(image,h3);

    document.getElementById('showImages').append(div);
    }); 
}