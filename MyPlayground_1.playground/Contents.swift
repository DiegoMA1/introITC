//: Playground - noun: a place where people can play

import UIKit

var str = "Hello, playground"
var var1=42
var1=50
let var2=34
let apples=1 
let oranges=5
let appleSummary="Yo tengo \(apples) manzanas y \(oranges) naranjas "
var animales = ["perro","gato","pez"]
animales[1]
var arrayEmpty = [String]()
var votos = [
"PAN":4,
"PRI":3,
"PRD":1]
votos["PAN"]
var list = [1,2,3,4,5,6,7,8]
for x in list {
    x
}

switch apples {
case 1:
    print("Hola")
case 2:
    print("Adios")
case 3:
    print("Quiubo")
default:
    print("Default")
}

func saludar (nombre:String)-> String{
    return "Hola \(nombre)"
    
}
print(saludar(nombre: "Diegolas"))




