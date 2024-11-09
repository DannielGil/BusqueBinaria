public static void main(String[] args) {
        
        int A [] = {1, 38, 71, 88, 93, 112, 122, 135, 177, 180, 202, 218, 231, 258, 288, 330, 348, 351, 353, 385, 432, 436, 465, 477, 484, 500, 506, 534, 576, 582, 586, 588, 611, 626, 638, 672, 678, 729, 755, 803, 810, 814, 821, 822, 852, 853, 868, 901, 935, 939};
        int pos = busquedaBinaria(A, 511);
        
        if (pos == -1){
            System.out.println("El dato no se encuentra en el arreglo");
        }else{
            System.out.println("El dato se encuenta en la posicion " +pos);
        }
    }   
    
    public static int busquedaBinaria(int [] A, int dato){
        int inicio,fin,mitad;
        inicio = 0;
        fin = A.length - 1;
        
        while(inicio <= fin){
            mitad = (inicio + fin)/2;
            if(A[mitad] == dato){
                return mitad;
            }else if(A[mitad] < dato){
                inicio = mitad + 1;
            }else{
                fin = mitad - 1;
            }
        }
        return - 1;
    }
