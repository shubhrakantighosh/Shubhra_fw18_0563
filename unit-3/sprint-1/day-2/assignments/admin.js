let arr=JSON.parse(localStorage.getItem("Products")) || [];
function ProductDetails(e){
    event.preventDefault();
    function Product(name,category,image,price,gender,sold){
        this.Productname=name;
        this.Category=category;
        this.Image=image;
        this.Price=price;
        this.Gender=gender;
        this.Sold=sold;
    }
let name=document.querySelector("#name").value;
let category=document.querySelector("#category").value;
let image=document.querySelector("#image").value;
let price=document.querySelector("#price").value;
let gender=document.querySelector("#gender").value;
let sold=document.querySelector("#sold").value;

let data=new Product(name,category,image,price,gender,sold);

arr.push(data);
localStorage.setItem("Products",JSON.stringify(arr));
}
document.getElementById('product').addEventListener('click',function(){
    goToProductPage();
});

function goToProductPage(){
    window.location.href='products.html';
}