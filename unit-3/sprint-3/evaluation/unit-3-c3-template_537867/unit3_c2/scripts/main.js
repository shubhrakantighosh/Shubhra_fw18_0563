document.getElementById('signUp').addEventListener('submit',signUp);
function signUp(){
  event.preventDefault();
  let name=document.getElementById('name').value;
  let email=document.getElementById('email').value;
  let address=document.getElementById('address').value;
  let amount=document.getElementById('amount').value;

 function User(name,email,address,amount){
   this.name=name;
   this.email=email;
   this.address=address;
   this.wallet=amount;
 }
  let data=new User(name,email,address,amount);

  localStorage.setItem('user',JSON.stringify(data)); 


  document.getElementById('name').value="";
  document.getElementById('email').value="";
  document.getElementById('address').value="";
  document.getElementById('amount').value="";


}