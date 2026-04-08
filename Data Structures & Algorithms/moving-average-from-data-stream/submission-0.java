class MovingAverage {

    private Queue<Integer> queue;
    private int size;
    private double sum; 

    public MovingAverage(int size) {
        this.size = size;
        queue = new LinkedList<>();
        this.sum = 0;
    }
    
    public double next(int val) {
        
        if(queue.size()==size){
            sum -=queue.poll();
        }

        queue.offer(val);
        sum += val;

        return sum / queue.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
