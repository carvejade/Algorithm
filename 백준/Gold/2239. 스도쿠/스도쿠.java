import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static int [][] board = new int [9][9];
	static List<int[]> blanks = new ArrayList<>();
	static boolean solved = false;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i =0; i<9;i++) {
			String str = br.readLine();
			for(int j=0; j<9; j++) {
				board[i][j]= str.charAt(j)-'0';
				if(board[i][j] ==0) blanks.add(new int[] {i,j});
			}
		}//스도쿠 완성시킴
		sudoku(0);
	}

	 static void sudoku(int idx) {
		 if(solved) return;
		 
		 if(idx == blanks.size()) {
			 printBoard();
			 solved = true;
			 return;
		 }
		 
		 int r = blanks.get(idx)[0];
		 int c =blanks.get(idx)[1];
		 for(int num =1; num<=9; num++) {
			 if(isvalid(r,c,num)) {
				 board[r][c] = num;
				 sudoku(idx+1);
				 board[r][c] =0;
			 }
		 }
	}
	 
	 //스도쿠? 검사 하겠음 
	 static boolean isvalid(int r, int c, int num) {
		 // 열 검사
		 for(int i=0; i<9; i++) {
			 if(board[r][i] == num) return false;
		 }
		 // ㅎ행 검사
		 for(int i =0; i<9; i++){
			 if(board[i][c] == num) return false;
			 
		 }
		 
		 //33박스 검사
		 int sr = (r/3)*3;
		 int sc = (c/3)*3;
		 
		 for(int i = sr; i<sr+3; i++) {
			 for (int j= sc; j<sc+3; j++) {
				 if(board[i][j] == num) return false;
				 
			 }
		 }
		 
		return true;
	}

	private static void printBoard() {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<9; i++) {
			for(int j =0; j<9; j++) {
				sb.append(board[i][j]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}