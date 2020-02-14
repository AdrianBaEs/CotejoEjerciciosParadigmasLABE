# -*- coding: utf-8 -*-
#ALUMNO: BR. LUIS ADRIAN BALAM ESPADAS, DOCENTE: M.M.M.D. JOSÉ LEONEL PECH MAY
print("Programación Lógica y Funcional U1 - Paradigma Procedural - Tabla de Multiplicar")
numTabla = int(input("¿De que valor deseas sacar su tabla de multiplicar?"))
tamTabla = int(input("¿Hasta que valor se va a multiplicar?"))
#SUBRUTINAS O PROCEDIMIENTOS
def generarTabla(numTabla,tamTabla):
    for i in range(tamTabla):
        imprimirRes(i,numTabla)
def imprimirRes(i,numTabla):
    if(i==0):
        print("---- TABLA DE MULTIPLICAR DEL #"+repr(numTabla)+" ----")
    print(repr(numTabla)+" x "+repr(i+1)+" = "+repr(numTabla*(i+1)))
generarTabla(numTabla,tamTabla)