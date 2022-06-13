/*
Save the user to local storage with key "user", in following format:- 
{
name: "",
image: "",
email: "",
country: "" (store country code "in", "ch", "nz", "us", "uk")
}
*/
document.getElementById('submit').addEventListener('click',function(){
    userData();
  });

  userData=()=>{
    let name=document.getElementById('user_name').value;
    let image=document.getElementById('user_pic').value;
    let email=document.getElementById('user_email').value;
    let country=document.getElementById('user_country').value;

    function DataObj(name,image,email,country){
      this.name=name;
      this.image=image;
      this.email=email;
      this.country=country;
    }
    let data=new DataObj(name,image,email,country);
    console.log(data);

    localStorage.setItem('user',JSON.stringify(data));

    document.getElementById('user_name').value="";
    document.getElementById('user_pic').value="";
    document.getElementById('user_email').value="";
    document.getElementById('user_country').value="";
  }