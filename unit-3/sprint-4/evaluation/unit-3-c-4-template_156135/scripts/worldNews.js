searchbox=async(value)=>{
    try {
    let url=await fetch(`https://masai-mock-api.herokuapp.com/news?q=${value}`);
    let data=await url.json();
    showData(data.articles);
    } catch (error) {
        
    }
  }
  
    twiter=()=>{
      let value=document.getElementById('search_box').value;
      if(value==='twitter'){
        document.getElementById('search_box').value="";
        searchbox(value);
      }
      else if(value==='tesla'){
        searchbox(value);
        document.getElementById('search_box').value="";
      }
    }
   
    document.querySelector('#navbar').addEventListener('click',function(){
      abc();
    })
  
      function abc(){
      let data1=document.querySelector('#navbar>h3').id;
      countryNews(data1);

      }
  
    countryNews=async(query)=>{
     try {
        let url=await fetch(`https://masai-mock-api.herokuapp.com/news/top-headlines?country=${query}`);
        let data=await url.json();
        showData(data.articles);
     } catch (error) {
        
     }
    }
  
  
    userData=()=>{
      let userCountry=JSON.parse(localStorage.getItem('user'));
    let query=userCountry.country;
    countryNews(query);
    }
    userData();
  
    showData=(data)=>{
      document.getElementById('news_result').innerHTML="";
      data.forEach(({title,author,urlToImage,description}) => {
        let div=document.createElement('div');
        div.style.cursor="pointer";
        div.addEventListener('click',function(){
          goToDetails(({title,author,urlToImage,description}));
        });
        
        let img=document.createElement('img');
        img.src=urlToImage;
  
        let h3=document.createElement('h3');
        h3.innerText=title;
  
        let h4=document.createElement('h4');
        h4.innerText=author;
  
        div.append(img,h3,h4);
  
        document.getElementById('news_result').append(div);
      });
    }
  
  
  
    goToDetails=(data)=>{
      localStorage.setItem('data',JSON.stringify(data));
      window.location.href='news.html';
    }