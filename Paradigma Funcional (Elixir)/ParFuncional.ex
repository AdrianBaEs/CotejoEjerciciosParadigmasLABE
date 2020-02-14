defmodule ParadigmaFuncional do

  def principal do
    textoUsuario = leer_entrada()
    resultado = calcular_numcaract(textoUsuario)
  end

  def leer_entrada do
    IO.gets("Escriba un texto: ")
  end

  def calcular_numcaract(textoUsuario) do
    "El texto tiene #{String.length(textoUsuario)-1} caracteres"
  end

  def imprimirRes(resultado) do
    IO.puts resultado
  end

end
