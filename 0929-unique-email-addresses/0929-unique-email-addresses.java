class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String[] parts = email.split("@");
            String localName = parts[0].split("\\+")[0].replace(".", "");
            String domainName = parts[1];
            set.add(localName + "@" + domainName);
            System.out.print(localName + "@" + domainName+"//");
        }
        return set.size();
    }
}