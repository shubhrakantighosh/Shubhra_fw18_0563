document.getElementById('order-form').addEventListener('submit',confirmProducts);

  function confirmProducts(){
    event.preventDefault();

    let name=document.getElementById('name').value;
    let number=document.getElementById('number').value;
    let address=document.getElementById('address').value;

    if(name!==""&&number!==""&&address!==""){
        orderStaus();
    }
    else{
        alert('Please Enter Valid Input');
        document.getElementById('name').value="";
        document.getElementById('number').value="";
        document.getElementById('address').value="";
    }
    
    
  }

    let i=0;
    let id;
    function orderStaus(){
     id=setInterval(function(){

      if(i===14){
        clearInterval(id);
    }

      if(i===0){
        alert('Your order is accepted ');
      }
      if(i===3){
        alert('Your order is being Prepared ');
      }

      if(i===8){
        alert('Your order is being packed ');
      }

      if(i===10){
        alert('Your order is out for delivery ');
      }

      if(i===12){
        alert('Order delivered')
      }
      i++;
    },1000)
    }
    