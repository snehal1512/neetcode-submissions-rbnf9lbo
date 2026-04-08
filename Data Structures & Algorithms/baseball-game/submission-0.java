class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> game = new Stack<>();
        int finalCount = 0;

        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                game.pop();
            } else if(operations[i].equals("D")) {
                int num = game.peek();
                game.push(num*2);
            } else if(operations[i].equals("+")) {
                int num1 = game.pop();
                int num2 = game.peek();

                game.push(num1);
                game.push(num1+num2);
            } else {
                game.push(Integer.parseInt(operations[i]));
            }
        }

        while(!game.isEmpty()) {
            finalCount+= game.pop();
        }

        return finalCount;
    }
}