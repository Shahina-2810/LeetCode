class MyCalendarTwo {

       private List<int[]> bookings;
        private List<int[]> overlaps;
    
    
    public MyCalendarTwo(){
        overlaps= new ArrayList<>();
        bookings= new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for(int[] overlap: overlaps){
            if(start< overlap[1] && end > overlap[0]){
                return false;
            }
        }
        for(int[] booking: bookings){
            if(start< booking[1] && end > booking[0]){
                int os= Math.max(start,booking[0]);
                int oe= Math.min(end,booking[1]);
                overlaps.add(new int[]{os,oe});
            }
        }
        bookings.add(new int[]{start,end});
        return true;
        
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */