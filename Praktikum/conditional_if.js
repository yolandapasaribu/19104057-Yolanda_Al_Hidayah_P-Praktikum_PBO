//deklarasi
var bilangan

//1 kondisi
bilangan = 10
if(bilangan ==10){
    console.log('Variabel bilangan memiliki nilai\t: ' + bilangan)
}

//2 kondisi
bilangan =15 
if(bilangan % 2 == 0){
    console.log(bilangan + ' adalah bilangan genap')
}else{
    console.log(bilangan + ' adalah bilangan ganjil')
}

//3 kondisi
bilangan = -30
if(bilangan > 0){
    console.log(bilangan + ' adalah bilangan positif')
}else if(bilangan < 10){
    console.log(bilangan + ' adalah bilangan negatif')
}else{
    console.log(bilangan + ' adalah bilangan netral')
}
