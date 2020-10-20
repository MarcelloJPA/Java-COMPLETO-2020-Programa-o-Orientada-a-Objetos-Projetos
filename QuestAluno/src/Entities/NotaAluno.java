package Entities;

public class NotaAluno {
	
	public String nome;
	public double primeiroTri;
	public double segundoTri;
	public double terceiroTri;
	
	
  public double finalAno() {
	  return primeiroTri + segundoTri + terceiroTri;
	  }
  
  public double pontosFaltam() {
	  if(finalAno() < 60.0) {
		  return 60.0 - finalAno() ;
	  }
	  else {
		  return 0.00;
	  }
  }
	  
}
