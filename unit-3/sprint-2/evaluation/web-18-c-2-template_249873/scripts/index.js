// Add the coffee to local storage with key "coffee"
async function prosductsDetails(){
    let url=await fetch(`https://masai-mock-api.herokuapp.com/coffee/menu`);
    let data=await url.json();
    let productsData=data.menu.data
    savtoLocalStroage(productsData)
  }
  prosductsDetails()

  function savtoLocalStroage(productsData){
    let arr=[];
    for(let i=0;i<productsData.length;i++){
      arr.push(productsData[i]);
    }
    localStorage.setItem('allmenu',JSON.stringify(arr));
  }

  let data=JSON.parse(localStorage.getItem('allmenu'));
  function showProducts(){

      data.forEach(function(elem){
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
      button.innerText='Add to Bucket';
    //   button.setAttribute('id','add_to_bucket');
      button.addEventListener('click',function(){
        cartProducts(elem);
      })

      div.append(img,title,description,price,button);

      document.getElementById('menu').append(div);

    })
  }
  showProducts()


  function cartProducts(elem){
    document.getElementById('add_to_bucket').innerHTML=''; 
    let array=JSON.parse(localStorage.getItem('coffee')) || [];
    
    array.push(elem);

    let count=document.createElement('h3');
    count.innerText=array.length;

    document.getElementById('add_to_bucket').append(count);

    localStorage.setItem('coffee',JSON.stringify(array));
  }