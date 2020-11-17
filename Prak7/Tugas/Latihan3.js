
//atribut
var nilai = [5,6,2,3,7]

//menggunakan apply
var max = Math.max.apply(Math, nilai)

var min =Math.min.apply(Math, nilai)

//output
console.log('Nilai\t: '+ nilai)
console.log('Nilai Maximal\t: ' + max)
console.log('Nilai Minimal \t: ' + min)
