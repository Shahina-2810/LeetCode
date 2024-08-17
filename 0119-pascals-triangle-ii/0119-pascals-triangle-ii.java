class Solution {
    public List<Integer> getRow(int rowIndex) {
       List<Integer> row = new ArrayList<>();
        if(rowIndex == 0){
            row.add(1);
            return row;
        }else {
            row.add(1);
            List<Integer> preRow = getRow(rowIndex - 1);
            for(int i=1; i<rowIndex; i++){
                row.add(preRow.get(i-1) + preRow.get(i));
            }
            row.add(1);
            return row;
        }
    }
}