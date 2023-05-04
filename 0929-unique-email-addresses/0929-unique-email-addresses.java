class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String[] parts = email.split("@");
            String localName = parts[0].replaceAll("\\.", "").split("\\+")[0];
            String domainName = parts[1];
            set.add(localName + "@" + domainName);
        }
        return set.size();
    }
}