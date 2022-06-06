async function data(){
    try {
      let url=await fetch('https://masai-vouchers-api.herokuapp.com/api/vouchers');
      let data=await url.json();
      let datall=data[0].vouchers
      dataShow(datall);
    } catch (error) {
      
    }
  }
  data();

   let myVoucher=JSON.parse(localStorage.getItem('user')) || [];
   let wallet=myVoucher.wallet;
   document.getElementById('wallet_balance').innerText=wallet;


  let dataShow=(datall)=>{
    datall.forEach(element => {
      let div=document.createElement('div');

      let img=document.createElement('img');
      img.src=element.image;

      let name=document.createElement('h3');
      name.innerText=element.name;

      let price=document.createElement('h4');
      price.innerText=element.price;

      let button=document.createElement('button');
      button.innerText='BUY';
      button.setAttribute('class','buy_voucher');
      button.addEventListener('click',function(){
        toBuy(element);
      })

      div.append(img,name,price,button);

      document.getElementById('voucher_list').append(div);
    });
  }


    let array=[];
  function toBuy(element){
    let price=Number(element.price);
    if(wallet-price<0){
      alert('Sorry! insufficient balance');
    }
    else{
        alert('Hurray! purchase successful" and update the amount in wallet');
      let sum=0;
    let price=Number(element.price);
    sum=wallet-price;
   document.getElementById('wallet_balance').innerText="";
   document.getElementById('wallet_balance').innerText=sum;

   let userData=JSON.parse(localStorage.getItem('user'));
   let name=userData.name;
   let email=userData.email;
   let address=userData.address;
   let amount=sum;

   function UserWallet(name,email,address,amount){
     this.name=name;
     this.email=email;
     this.address=address;
     this.wallet=amount;
   }
    let data=new UserWallet(name,email,address,amount);
    localStorage.setItem('user',JSON.stringify(data)); 


    let image=element.image;
    let name1=element.name;
    let price1=element.price;

    function UserPurchase(image,name1,price1){
     this.image=image;
     this.name=name1;
     this.price=price1;
   }
    let data1=new UserPurchase(image,name1,price1);

    array.push(data1);
    console.log(array)
    localStorage.setItem('purchase',JSON.stringify(array));
  }
  }