package exercises;

import java.util.Arrays;

public class Solution {

	   public int[] getConcatenation(int[] nums) {
	        int n = nums.length; // Obtém o tamanho do array nums
	        int[] ans = new int[2 * n]; // Cria um novo array ans com o dobro do tamanho de nums

	        // Loop para percorrer os elementos do array nums
	        for (int i = 0; i < n; i++) {
	            ans[i] = nums[i]; // Atribui o valor de nums[i] para ans[i]
	            ans[i + n] = nums[i]; // Atribui o mesmo valor de nums[i] para ans[i + n]
	        }

	        return ans; // Retorna o array ans resultante
	    }
	

	public static void main(String[] args) {
		Solution solution = new Solution();
		
		   int[] nums1 = {1, 2, 1};
	        int[] result1 = solution.getConcatenation(nums1);
	        System.out.println(Arrays.toString(result1));  // Deve imprimir [1, 2, 1, 1, 2, 1]
	        
	        int[] nums2 = {1, 3, 2, 1};
	        int[] result2 = solution.getConcatenation(nums2);
	        System.out.println(Arrays.toString(result2));
	}

}
/*
int n = nums.length;: Obtém o tamanho do array de entrada nums e armazena em n.

int[] ans = new int[2 * n];: Cria um novo array chamado ans com o dobro do tamanho de nums. O objetivo é armazenar a concatenação de nums consigo mesmo.

for (int i = 0; i < n; i++) {: Inicia um loop que percorre os elementos do array nums usando a variável de controle i.

ans[i] = nums[i];: Atribui o valor de nums[i] para o índice i do array ans. Isso corresponde à primeira metade do array resultante.

ans[i + n] = nums[i];: Atribui o mesmo valor de nums[i] para o índice i + n do array ans. Isso corresponde à segunda metade do array resultante.

O loop continua até que todos os elementos de nums tenham sido processados.

return ans;: Retorna o array resultante ans, que é a concatenação de nums consigo mesmo.
*/