let data=JSON.parse(localStorage.getItem("products"));
allproducts(data);

function allproducts(data){
  data.forEach(function(elem,index){

    let div=document.createElement("div");

    let img=document.createElement("img");
    img.src=elem.image;

    let type=document.createElement("h3");
    type.innerText="Type"+":"+" "+elem.type;

    let desc=document.createElement("h3");
    desc.innerText="Description"+":"+" "+elem.desc;

    let price=document.createElement("h3");
    price.innerText="Price"+":"+" "+elem.price;

    let button=document.createElement("button");
    button.innerText="Remove";
    button.style.color="white";
    button.style.background="red";
    button.style.padding="5px 10px 5px 10px";
    button.style.borderRadius="6px";
    button.style.border="none";
    button.setAttribute("id","remove_product");
    button.addEventListener("click",function(){
      removeProduct(elem,index);
    })

    div.append(img,type,desc,price,button);

    document.getElementById("all_products").append(div);
  })
}
function removeProduct(elem,index){
  data.splice(index,1);
  localStorage.setItem("products",JSON.stringify(data));
  window.location.reload();
}
document.getElementById("add_more_product").addEventListener("click",add_Product_page);

function add_Product_page(){
    event.preventDefault();
    window.location.href="index.html"
}