let data=JSON.parse(localStorage.getItem('YouTube'));

    let iframe =document.createElement('iframe');
    iframe.src=data[0].iframe;

    let h3=document.createElement('h3');
    h3.innerText=data[0].title;

    let p=document.createElement('p');
    p.innerText=data[0].channelTitle;

    document.getElementById('results').append(iframe,p,h3);