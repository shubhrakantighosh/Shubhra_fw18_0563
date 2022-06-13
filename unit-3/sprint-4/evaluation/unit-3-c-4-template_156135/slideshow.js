let data=JSON.parse(localStorage.getItem('user'));

  let image=document.createElement('img');
  image.src=data.image;
  image.setAttribute('id','user_img');

  let h3=document.createElement('h3');
  h3.innerText=data.name;
  h3.setAttribute('id','user_name');

  let h4=document.createElement('h4');
  h4.innerText=data.email;
  h4.setAttribute('id','user_email');

  let h5=document.createElement('h5');
  h5.setAttribute('id','user_country');

  if(data.country==="in"){
    h5.innerText="India";
  }
  else if(data.country==="us"){
    h5.innerText="Usa";
  }
  else if(data.country==="ch"){
    h5.innerText="China";
  }
  else if(data.country==="uk"){
    h5.innerText="UK ";
  }
  else{
    h5.innerText="New Zealand";
  };

  export{image,h3,h4,h5};
//   document.getElementById('slideShow').append(image,h3,h4,h5)