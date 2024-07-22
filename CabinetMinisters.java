class CabinetMinistersRunner {
    public static void main(String[] args) {
        String[] cabinetMinisters = {
            "Narendra Modi", "Amit Shah", "Rajnath Singh", "Nirmala Sitharaman", 
            "Subrahmanyam Jaishankar", "Prakash Javadekar", "Piyush Goyal", 
            "Dharmendra Pradhan", "Mukhtar Abbas Naqvi", "Smriti Irani", 
            "Harsh Vardhan", "Nitin Gadkari", "Thawar Chand Gehlot", 
            "Ravi Shankar Prasad", "Arjun Munda", "Narendra Singh Tomar", 
            "Gajendra Singh Shekhawat", "Ramesh Pokhriyal", "S. Jaishankar", 
            "Hardeep Singh Puri", "Pralhad Joshi", "Mahendra Nath Pandey", 
            "Arvind Sawant", "Giriraj Singh", "Ram Vilas Paswan", 
            "G. Kishan Reddy", "Prahlad Singh Patel", "Sanjeev Balyan", 
            "Faggan Singh Kulaste", "Ashwini Kumar Choubey"
        };

        System.out.println("The Cabinet Ministers of India are:");
        for (int Ministers = cabinetMinisters.length; Ministers >=0; Ministers--) {
            System.out.println(cabinetMinisters[Ministers]);
        }
    }
}
