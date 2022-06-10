addProduct=async()=>{
    const data={
        id:document.getElementById('id').value,
        image:document.getElementById('image').value,
        name:document.getElementById('name').value,
        price:document.getElementById('price').value
    }
    let reposne=await fetch('http://localhost:5000/api/products',{
    method:'POST',
    body:JSON.stringify(data),

    headers:{'Content-Type':'application/json'},
});
let dat=await reposne.json();
}

deleteProduct=async()=>{
    let id=document.getElementById('delete').value;

    let reposne=await fetch(`http://localhost:5000/api/products/${id}`,{
        method:'DELETE',
        headers:{'Content-Type':'application/json'},

    })

    let dat=await reposne.json()

}

updateProduct=async()=>{
    let update=document.getElementById('update').value;
    let update_name=document.getElementById('update_name').value;
    let reposne=await fetch(`http://localhost:5000/api/products/${update}`,{
        method:'PUT',
        body:JSON.stringify ({
            id:update,
            name:update_name,
        }),

        headers:{'Content-Type':'application/json'},

    });

    let dat=await reposne.json()
}

show=async()=>{

    let data=await fetch(`http://localhost:5000/api/products`);
    let allData=await data.json();

    allData.forEach(element => {
        let div=document.createElement('div');

        let id=document.createElement('h4');
        id.innerText=element.id;

        let image=document.createElement('img');
        image.src=element.image;

        let name=document.createElement('h3');
        name.innerText=element.name;

        let price=document.createElement('p');
        price.innerText=element.price;

        div.append(image,id,name,price);

        document.getElementById('show').append(div);
    });
}
show()