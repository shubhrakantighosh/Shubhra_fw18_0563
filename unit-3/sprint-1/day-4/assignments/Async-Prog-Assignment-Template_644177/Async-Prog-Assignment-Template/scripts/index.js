function Slideshow(url,movies_name,release_date,rating){
    this.url=url;
    this.movies_name=movies_name;
    this.release_date=release_date;
    this.rating=rating;
}
    const movie1=new Slideshow("https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_1_5x/sources/r1/cms/prod/6536/846536-v","Baaghi3","11-03-2022",5)

    const movie2=new Slideshow("https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/4920/1044920-v-1ac34349aead","Bhuj","15-03-2022",6)
  
    const movie3=new Slideshow("https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/6828/556828-v","Super30","01-05-2022",9)
  
    const movie4=new Slideshow("https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/5085/635085-v","Bahubali2","15-05-2022",6)
  
    const movie5=new Slideshow("https://img1.hotstarext.com/image/upload/f_auto,t_web_hs_3x/sources/r1/cms/prod/4290/754290-h","Avatar","10-03-2022",5)
  
    const movie6=new Slideshow("https://img1.hotstarext.com/image/upload/f_auto,t_web_hs_3x/sources/r1/cms/prod/4469/674469-h","Avengers","19-08-2022",2)
  
    const movie7=new Slideshow("https://img1.hotstarext.com/image/upload/f_auto,t_web_hs_3x/sources/r1/cms/prod/1527/571527-h","Mission Mangal","11-07-2022",8)
  
    const movie8=new Slideshow("https://img1.hotstarext.com/image/upload/f_auto,t_web_vl_3x/sources/r1/cms/prod/5085/635085-v","Bahubali2","15-02-2022",9)
  
    const movie9=new Slideshow("https://img1.hotstarext.com/image/upload/f_auto,t_web_hs_1_5x/sources/r1/cms/prod/4507/674507-h","Thor","05-03-2022",7)

const array= [];

array.push(movie1,movie2,movie3,movie4,movie5,movie6,movie7,movie8,movie9);

let data=localStorage.setItem("movies",JSON.stringify(array)) ;

let i=0;
function slideshows(){
    let data=JSON.parse(localStorage.getItem("movies"));

    let container=document.getElementById("slideshow");
    setInterval(function(){

        if(i===data.length){
            i=0;
        }
        container.innerHTML=null;
        let img=document.createElement("img");
        img.src=data[i].url;
        container.append(img);

        i++;
        
    },3000)
}
slideshows();

    
    document.querySelector("#sort-hl").addEventListener("click",hightoLow);
    function hightoLow(){
        movies.sort(function(a,b){
          return b.rating-a.rating;
        });
        displaydata(movies);
    }

    document.querySelector("#sort-lh").addEventListener("click",lowtoHigh);
    function lowtoHigh(){
        movies.sort(function(a,b){
          return a.rating-b.rating;
        });
        displaydata(movies);
    }


let movies=JSON.parse(localStorage.getItem("movies"));
    displaydata(movies);
    function displaydata(movies){
    document.querySelector("#movies").innerHTML="";
    movies.forEach(function(elem){
    let div=document.createElement("div");

    let poster=document.createElement("img");
    poster.src=elem.url;

    let movies_name=document.createElement("h3");
    movies_name.innerText=elem.movies_name;

    let release_date=document.createElement("p");
    release_date.innerText=elem.release_date;

    div.append(poster,movies_name,release_date);

    document.getElementById("movies").append(div);
})
}