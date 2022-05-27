document.getElementById('navbar').addEventListener('submit',searchBar);
function searchBar(){
    event.preventDefault();
    let movie_name=document.getElementById('movie_name').value;
    let movie_year=document.getElementById('movie_year').value;

      async function movieSearch(){   
         let res=await fetch(`https://www.omdbapi.com/?t=${movie_name}&y=${movie_year}&plot=full&apikey=4ea394d3`);
         let movie_details=await res.json();

         document.getElementById('all_Movies').style.border='5px white solid';

         document.getElementById('movie_poster').innerHTML='';
         document.getElementById('movie_details').innerHTML='';

         if(movie_details.Title!==""){

            document.getElementById('movie_name').value='';
            document.getElementById('movie_year').value='';

            let Poster=document.createElement('img');
            Poster.src=movie_details.Poster;
            
            let Title=document.createElement('h2');
            Title.innerText=movie_details.Title;
   
            let Released=document.createElement('p');
            Released.innerText=movie_details.Released;
   
            let Runtime=document.createElement('p');
            Runtime.innerText=movie_details.Runtime;
   
            let Genre=document.createElement('p');
            Genre.innerText=movie_details.Genre;
   
            let Rated=document.createElement('p');
            Rated.innerText=movie_details.Rated;
   
            let Director=document.createElement('p');
            Director.innerText=movie_details.Director;
   
            let Writer=document.createElement('p');
            Writer.innerText=movie_details.Writer;
   
            let Actors=document.createElement('p');
            Actors.innerText=movie_details.Actors;
   
            let Language=document.createElement('p');
            Language.innerText=movie_details.Language;
   
            let Country=document.createElement('p');
            Country.innerText=movie_details.Country;
   
            let Awards=document.createElement('p');
            Awards.innerText=movie_details.Awards;
            
            let Plot=document.createElement('p');
            Plot.innerText=movie_details.Plot;
   
            let Type=document.createElement('p');
            Type.innerText=movie_details.Type;
            
            let Year=document.createElement('p');
            Year.innerText=movie_details.Year;

            if(Number(movie_details.imdbRating)>8.5){

            let imdbRating=document.createElement('h3');
            imdbRating.innerText=movie_details.imdbRating;

            let recommended=document.createElement('h4');
            recommended.innerText='Recommended';
                 
            document.getElementById('movie_poster').append(Poster);
   
            document.getElementById('movie_details').append(Title,Released,Runtime,Genre,Rated,Director,Writer,Actors,Language,Country,Awards,Plot,Type,Year,imdbRating,recommended);

            }
            else{
            let imdbRating=document.createElement('h3');
            imdbRating.innerText=movie_details.imdbRating;
            document.getElementById('movie_poster').append(Poster);
   
            document.getElementById('movie_details').append(Title,Released,Runtime,Genre,Rated,Director,Writer,Actors,Language,Country,Awards,Plot,Type,Year,imdbRating);
            }
          
         }

         if(movie_details.Title===undefined){

            document.getElementById('all_Movies').innerHTML='';

            let not_Found_Image=document.createElement('img');
            not_Found_Image.setAttribute('id','movie_no_found');
                  
            not_Found_Image.src='https://freefrontend.com/assets/img/html-funny-404-pages/CodePen-404-Page.gif';
                  
            home_button=document.createElement('button');
            home_button.style.innerHTML="Home Page";
            home_button.style.cursor='pointer';
            home_button.addEventListener("click",function(){
                         goToHome();
            });
            home_button.setAttribute('id','home_button');
            document.getElementById('all_Movies').append(not_Found_Image);
            document.querySelector('body').append(home_button)
            document.querySelector('body').style.background='white';
            document.getElementById('navbar').style.backgroundColor='white';
            document.getElementsByTagNameNS('h1').style.backgroundColor='red';
         }
         
     } 
     movieSearch();
   };

function goToHome(){
window.location.reload();
}