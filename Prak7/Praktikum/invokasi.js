/*
* Code ditulis oleh Yolanda Al Hidayah Pasaribu
*/

function myFunction (a,b,c){
    console.log('Hello, my name is', a)
    console.log("I'm" , b , ' years old');
    console.log('I like ', c)
}

console.log('\nOutput contoh 1')
//melakukan invokasi fungsi
myFunction('Yolanda Al Hidayah Pasaribu', 19, 'Design')

//contoh2 
function myFunction2(arg1, arg2){
    this.firstName = arg1
    this.lastName = arg2
}

//membuat objek dari fungsi myFunction
var x = new myFunction2('Bambang','sayonaraa')

console.log("\nOutput Contoh 2")
//memanggil fungsi dari properti yang ada di dalam fungsi
console.log (x.firstName)
