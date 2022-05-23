let array=JSON.parse(localStorage.getItem("products")) || [];

  document.getElementById("products").addEventListener("submit",myCheck);
  function myCheck(){
    event.preventDefault();
    function Product(type,description,price,imageurl){
      this.type=type;
      this.desc=description;
      this.price=price;
      this.image=imageurl;
    }

    let type=document.getElementById("type").value;
    let description=document.getElementById("desc").value;
    let price=document.getElementById("price").value;
    let imageurl=document.getElementById("image").value;
    
    let data=new Product(type,description,price,imageurl);

    array.push(data);

    localStorage.setItem("products",JSON.stringify(array));

    document.getElementById("type").value="";
    document.getElementById("desc").value="";
    document.getElementById("price").value="";
    document.getElementById("image").value="";
  }//store the products array in localstorage as "products"
document.getElementById("show_products").addEventListener("click",show_Product_Page);
function show_Product_Page(){
    window.location.href="inventory.html"
}