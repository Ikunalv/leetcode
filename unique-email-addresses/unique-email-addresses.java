class Solution {
    public int numUniqueEmails(String[] emails) {
        
        HashSet<String> set = new HashSet<String>();
        
        for(String email:emails){
            String[] name = email.split("@");
            String withoutPlus = name[0].split("[+]")[0];
            String withoutDot =withoutPlus.replace(".","");
            String n = withoutDot+"@"+name[1];
            
            set.add(n);            

        }
        return set.size();     
    }
}