let data=JSON.parse(localStorage.getItem('purchase')) || [];

data.forEach(element => {
let div=document.createElement('div');

let img=document.createElement('img');
img.src=element.image;

let name=document.createElement('h3');
name.innerText=element.name;

let price=document.createElement('h4');
price.innerText=element.price;

div.append(img,name,price);

document.getElementById('purchased_vouchers').append(div);
});

let myVoucher=JSON.parse(localStorage.getItem('user')) || [];
let wallet=myVoucher.wallet;
document.getElementById('wallet_balance').innerText=wallet;