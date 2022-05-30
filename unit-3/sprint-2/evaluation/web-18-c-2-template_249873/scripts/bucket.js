// On clicking remove button the item should be removed from DOM as well as localstorage.
let button_checkout=document.createElement('button');
button_checkout.innerText='Checkout';
button_checkout.setAttribute('id','confirm_checkout');
button_checkout.addEventListener('click',function(){
checkoutProducts();
})
 let sum=0;
document.querySelector('body').append(button_checkout);

 let data=JSON.parse(localStorage.getItem('coffee')) || [];


 data.forEach(function(elem,index){

 sum=sum+Number(elem.price);


 let div=document.createElement('div');

 let img=document.createElement('img');
 img.src=elem.image;

 let title=document.createElement('h3');
 title.innerText=elem.title;

 let description=document.createElement('p');
 description.innerText=elem.description;

 let price=document.createElement('h4');
 price.innerText=elem.price;

 let button=document.createElement('button');
 button.innerText='Remove';
 button.setAttribute('id','remove_coffee');
 button.addEventListener('click',function(){
   removeProducts(elem,index);
 })

 div.append(img,title,price,button);


 document.getElementById('bucket').append(div);

})
document.getElementById('total_amount').append(sum);

function removeProducts(elem,index){
data.splice(index,1)
localStorage.setItem('coffee',JSON.stringify(data));
window.location.reload();
}


function checkoutProducts(){
window.location.href='checkout.html';
}