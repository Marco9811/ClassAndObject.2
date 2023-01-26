package it.delehopeClass;

public class Competition {
        public static void main(String[] args) {
            Programmer p1 = new Programmer();
            p1.name = "Luca";
            p1.yearsOfExperience = 5;
            p1.programmingLanguage ="Java";
            Programmer p2 = new Programmer();
            p2.name = "1727";
            p2.yearsOfExperience = 8;
            p2.programmingLanguage = "Java";
            Programmer p3 = new Programmer();
            p3.name = "Giovanni";
            p3.yearsOfExperience = 2;
            p3.programmingLanguage = "HTML";
            Programmer p4 = new Programmer();
            p4.name = "1998";
            p4.yearsOfExperience = 12;
            p4.programmingLanguage = "JavaMobile";
            CompetitionRules rules =  CompetitionRules.getRules();
            rules.printRules();
            Team teamA = new Team();
            Team teamB = new Team();
            teamA.teamName = "Giallo";
            teamA.p1 = p1;
            teamA.p2 = p2;
            teamB.teamName = "blue";
            teamB.p1 = p3;
            teamB.p2 = p4;
            teamA.printTeamDetails();
            teamB.printTeamDetails();
        }
    }

