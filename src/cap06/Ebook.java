package cap06;

public class Ebook extends Livro{


	public Ebook(Autor autor) {
		super(autor);
	}


	private String waterMark;
	
	
	public String getWaterMark(){
		return waterMark;
	}


	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	//Ao anotar nosso m�todo com @Override, o c�digo n�o compilar�
	//caso esse m�todo n�o exista na classe pai (superclasse).
	@Override
	public boolean aplicaDesconta(double porcetagem){
		if(porcetagem > 0.15){
			return false;
		}
				
		double desconto = this.getValor() * porcetagem;
		this.setValor(this.getValor() - desconto);
		
		this.valor -= this.valor * porcetagem;
		
		return true;
		System.out.println("aplicando desconto no ebook");
		return super.aplicaDesconta(porcetagem);
	}
	
}
