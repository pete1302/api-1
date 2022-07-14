package leetcode.api.service;

public class Query {
    
    public static String getQuery(int x, String username) {
        
        String query = null;
        switch (x) {
            case 1:
                query = String.format("{\"query\":\"query getUserProfile($username: String!) { allQuestionsCount { difficulty count } matchedUser(username: $username) { contributions { points } profile { reputation ranking } submissionCalendar submitStats { acSubmissionNum { difficulty count submissions } totalSubmissionNum { difficulty count submissions } } } } \",\"variables\":{\"username\":\"%s\"}}", username);
                // return query1 ;
                break;
        
            case 2:
                query = String.format("{\"query\":\"query getUserProfile($username: String!) {  matchedUser(username: $username) { contributions { points } profile { reputation ranking } } } \",\"variables\":{\"username\":\"%s\"}}", username);
                // return query2 ;
                break;
            case 3:
                query = String.format("{\"query\":\" query userRankings {  globalRanking {    page    rankingNodes {      currentRating      currentGlobalRanking      ranking      dataRegion      user {        username        nameColor        profile {          userAvatar          countryCode          countryName        }        activeBadge {          displayName          icon        }        contestBadge {          displayName          icon        }      }    }  }}\",\"variables\":{\"username\":\"%s\"}}", username);
                break;

            case 4:
                query = String.format("{\"query\":\"query getUserProfile($username: String!) {   matchedUser(username: $username) {        contributions { points }         profile {            ranking           userAvatar           realName           aboutMe           school           websites           countryName           company           jobTitle           skillTags           postViewCount           postViewCountDiff           reputation           reputationDiff           solutionCount           solutionCountDiff           categoryDiscussCount           categoryDiscussCountDiff            }         activeBadge {           displayName           icon         }   }    }    \",\"variables\":{\"username\":\"%s\"}}", username);
                break;
                    
            default:
                break;
        }

        return query;
    }

}

/*
 * userRankings {\n  globalRanking {\n    page\n    rankingNodes {\n      currentRating\n      currentGlobalRanking\n      ranking\n      dataRegion\n      user {\n        username\n        nameColor\n        profile {\n          userAvatar\n          countryCode\n          countryName\n        }\n        activeBadge {\n          displayName\n          icon\n        }
 */
// userRankings {\n  globalRanking {\n    page\n    rankingNodes {\n      currentRating\n      currentGlobalRanking\n      ranking\n      dataRegion\n      user {\n        username\n        nameColor\n        profile {\n          userAvatar\n          countryCode\n          countryName\n        }\n        activeBadge {\n          displayName\n          icon\n        }}}}}
