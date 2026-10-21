class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for(int i=0;i<emails.length;i++){
            String email=emails[i];
            int at=email.indexOf('@');
            String local = email.substring(0, at);
            String domain = email.substring(at);
            int plus = local.indexOf('+');
            if (plus != -1) {
                local = local.substring(0, plus);
            }
            local = local.replace(".", "");
            String cleanEmail= local + domain;
            uniqueEmails.add(cleanEmail);
        }
        return uniqueEmails.size();
    }
}