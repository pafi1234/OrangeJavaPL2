package pl.sda.OrangeJavaPL2.apiConsuming;
//
//{
//        "activity": "Start a blog for something you're passionate about",
//        "type": "recreational",
//        "participants": 1,
//        "price": 0.05,
//        "link": "",
//        "key": "8364626",
//        "accessibility": 0.1
//        }

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MyFirstConsumerResponse {
    private String activity;
    private String type;
    private Integer participants;
    private Double price;
    private String link;
    private String key;
    private Double accessibility; //"accessibility" : 0.7
    // Parse you custom JSON from external service
    // Create you Java Object
    // Parse JSON to Java Object
    // Log your Java Object using toStringMethod
}
