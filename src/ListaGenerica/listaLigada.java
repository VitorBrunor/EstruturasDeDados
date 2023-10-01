package ListaGenerica;
public class listaLigada<TIPO> {
   private elemento<TIPO> primeiro;
   private elemento<TIPO> ultimo;
   private int tamanho;

   public listaLigada() {
      this.tamanho = 0;
   }

   public elemento<TIPO> getPrimeiro() {
      return primeiro;
   }

   public void setPrimeiro(elemento<TIPO> primeiro) {
      this.primeiro = primeiro;
   }

   public elemento getUltimo() {
      return ultimo;
   }

   public void setUltimo(elemento<TIPO> ultimo) {
      this.ultimo = ultimo;
   }

   public int getTamanho() {
      return tamanho;
   }

   public void setTamanho(int tamanho) {
      this.tamanho = tamanho;
   }

   public void adicionar(TIPO novoValor) {
      elemento novoElemento = new elemento<TIPO>(novoValor);
      if(this.primeiro == null && this.ultimo == null){
         this.primeiro = novoElemento;
         this.ultimo = novoElemento;
      }else{
         this.ultimo.setProximo(novoElemento);
         this.ultimo = novoElemento;
      }
      this.tamanho++;
   }

   public void remover(TIPO valorProcurado) {
      elemento<TIPO> anterior = null;
      elemento<TIPO> atual = this.primeiro;
      for(int i = 0; i < this.getTamanho(); i++ ) {
         if(atual.getValor().equals(valorProcurado)){
            if(this.tamanho == 1){
               this.primeiro = null;
               this.ultimo = null;
            }else if(atual == primeiro){
               this.primeiro = atual.getProximo();
               atual.setProximo(null);
            }else if (atual == ultimo){
               this.ultimo = anterior;
               anterior.setProximo(null);
            }else{
               anterior.setProximo(atual.getProximo());
               atual = null;
            }
            this.tamanho--;
            break;
         }
         anterior = atual;
         atual = atual.getProximo();
      }
   }

   public elemento get(int posicao) {
      elemento atual = this.primeiro;
      for(int i = 0; i < posicao; i++){
         if(atual.getProximo() != null){
            atual = atual.getProximo();
         }
      }
      return atual;
   }
}