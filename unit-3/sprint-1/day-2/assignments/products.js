let data=JSON.parse(localStorage.getItem("Products")) || [];
data.forEach(function(elem,index){
   let div=document.createElement("div"); 

   let button1=document.createElement("button");
   button1.innerText="Delete";
   button1.style.background="grey";
   button1.style.cursor="pointer";
   button1.addEventListener("click",function(){
   deleteproduct(elem,index);
  });
   
   let Productname=document.createElement("h1");
   Productname.innerText=elem.Productname;
   let Category=document.createElement("p");
   Category.innerText=elem.Category;

   let Gender=document.createElement("p");
   Gender.innerText=elem.Gender;

   let Image=document.createElement("img");
   Image.src=elem.Image;
   
   let Price=document.createElement("p");
   Price.innerText=elem.Price;

   if(elem.Sold==="false"){
    let button2=document.createElement("button");
    button2.innerText=elem.Sold;
    button2.style.background="green";
    button2.addEventListener("click",function(){
      let sold=elem.sold;
      falsetotrue(sold)
   });

    div.append(Productname,Category,Gender,Image,Price,button1,button2)
   }
   else{
    let button2=document.createElement("button");
    button2.innerText=elem.Sold;
    button2.style.background="red";
    button2.style.cursor="pointer";
    button2.addEventListener("click",function(){
       button2.innerText="false";
       button2.style.background="green";
    });
  

    div.append(Productname,Category,Gender,Price,button1,button2)
   }

   document.querySelector("#counter").append(div);
});

function deleteproduct(elem,index){
    data.splice(index,1);
    localStorage.setItem("Products",JSON.stringify(data));
    window.location.reload();
  }

  function falsetotrue(sold){
    if(sold=="false") 
     {button2.innerText="true";
      button2.style.background="red";
    }
    else if(sold=="true"){
      {button2.innerText="false";
      button2.style.background="green";
    }
    }
  }


document.getElementById('admin').addEventListener('click',function(){
    goToProductPage();
});

function goToProductPage(){
    window.location.href='admin.html';
}