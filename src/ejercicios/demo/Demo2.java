package Demo2;

public class Demo2 {
	
		/**
		 * Devuelve verdadero si todos los elementos están en el conjunto.
		 */
		public static boolean pertenecenTodos(int[] elems, int[] conjunto) {
			int cont=0;
			if(elems.length<conjunto.length){
		
			for(int i=0;i<elems.length;i++){
				
				if(estaEn(elems[i],conjunto)==true){
						cont++;
					}
			}
			if(cont==elems.length){
				return true;
			
			}
			
			}	
			if(elems.length>conjunto.length){
				for(int i=0;i<conjunto.length;i++){
					
					if(estaEn(elems[i],conjunto)==true){
							cont++;
						}
				}
				if(cont==elems.length){
					return true;
				
				}
				
			return false;

				
				
			}
			return false;
		}
			
			
		
		
	public static boolean estaEn(int x,int[]a){
		for (int i=0;i<a.length;i++){
			if(x==a[i]){
				return true;
				
			}
	
		}
		return false;
	}
	public static int indicePico(int[] arreglo) {
			int temp=0;
			int temp2=0;
			for(int i=0;i<arreglo.length;i++){
				if(arreglo [i]>arreglo[i+1]){
					return i;
				}
				if(i>0){
					temp=arreglo[i-1];
					temp2=arreglo[i+1];
				
				//System.out.println(arreglo[i]);
					if(arreglo[i]>temp && arreglo[i]>temp2){
						return i;
				
					}
					}
					
					}
			
				
				
			return -1;	
				
			
	
	}

	public static void main(String[] args) {
			
	int [] a= new int[7];
	int [] b= new int[5];
	a[0]=0;
	a[1]=1;
	a[2]=2;
	a[3]=3;
	a[4]=4;
	a[5]=5;
	a[6]=6;
	b[0]=0;
	b[1]=1;
	b[2]=2;
	b[3]=3;
	b[4]=4;
	for(int i=0;i<a.length;i++){
	System.out.print(a[i]+ " ");
	}
	for(int i=0;i<b.length;i++){
	System.out.print(b[i]+ " ");
	}
	//System.out.println(indicePico(a));
	System.out.println(pertenecenTodos(b, a));
	}
}


	



