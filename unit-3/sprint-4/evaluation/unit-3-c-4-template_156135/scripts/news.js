let data=JSON.parse(localStorage.getItem('data'));

let img=document.createElement('img');
img.src=data.urlToImage;

let h3=document.createElement('h3');
h3.innerText=data.title;

let h4=document.createElement('h4');
h4.innerText=data.description;

document.getElementById('detailed_news').append(img,h3,h4);