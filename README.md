> Case - 1

Sample JSON String:

```text
"{ \"mappings\": { \"_doc\": { \"properties\": { \"_class\": { \"type\": \"text\", \"fields\": { \"keyword\": { \"type\": \"keyword\", \"ignore_above\": 256 } } }, \"id\": { \"type\": \"text\", \"fields\": { \"keyword\": { \"type\": \"keyword\", \"ignore_above\": 256 } } } } } } }"
```

Convert JSON

```json
{
    "mappings": {
        "_doc": {
            "properties": {
                "_class": {
                    "type": "text",
                    "fields": {
                        "keyword": {
                            "type": "keyword",
                            "ignore_above": 256
                        }
                    }
                },
                "id": {
                    "type": "text",
                    "fields": {
                        "keyword": {
                            "type": "keyword",
                            "ignore_above": 256
                        }
                    }
                }
            }
        }
    }
}
```

Case 2: 

> Sample String 

```text
"{\"headline\": \"How to Pay off Credit Card Debt in 2024\", \"articleBody\": \"test\", \"description\": \"We know how easy it is to rack up credit card debt but getting out of it can be hard. Here's The Penny Hoarder's complete guide on how to pay off credit card debt.\", \"datePublished\": \"2023-02-20T15:35:07+00:00\", \"datePublishedRaw\": \"2023-02-20T15:35:07+00:00\", \"dateModified\": \"2024-05-13T18:35:55+00:00\", \"dateModifiedRaw\": \"2024-05-13T18:35:55+00:00\", \"authors\": [{\"name\": \"Janet Keeler\", \"nameRaw\": \"Janet Keeler\"}], \"inLanguage\": \"en\", \"mainImage\": {\"url\": \"https://cdn.thepennyhoarder.com/wp-content/uploads/2019/08/19132958/DEBT-HOW-TO-PAY-CREDIT-CARDS-final.jpg\"}, \"images\": [{\"url\": \"https://cdn.thepennyhoarder.com/wp-content/uploads/2019/07/05140024/Credit_Cards_Finance_001-300x200.jpg\"}, {\"url\": \"https://cdn.thepennyhoarder.com/wp-content/uploads/2018/08/28140007/08-18-FB-DebtMethods-1-300x300.png\"}, {\"url\": \"https://cdn.thepennyhoarder.com/wp-content/uploads/2022/03/14154759/pay-off-credit-card-debt-final.jpg\"}, {\"url\": \"https://cdn.thepennyhoarder.com/wp-content/uploads/2019/08/19132958/DEBT-HOW-TO-PAY-CREDIT-CARDS-final.jpg\"}], \"url\": \"https://www.thepennyhoarder.com/debt/how-to-pay-off-credit-card-debt/\", \"canonicalUrl\": \"https://www.thepennyhoarder.com/debt/how-to-pay-off-credit-card-debt/\", \"metadata\": {\"probability\": 0.9678834080696106, \"dateDownloaded\": \"2024-05-16T11:02:46Z\"}, \"_type\": \"ArticleItem\", \"provided_url\": [\"https://wallethub.com/credit-cards/compare/\"], \"root_domain\": \"https://www.thepennyhoarder.com\", \"s3\": {\"bucket\": \"ews-dev-logged-out-search-zyte\", \"key\": \"prod/current_article_items.json\"}, \"dwh_timestamp\": \"2024-05-16T11:07:50.819Z\", \"publisherLogo\": \"https://cdn-search.dev-ews.engine.tech/publishers/thepennyhoarder.png\", \"publisherName\": \"The Penny Hoarder\", \"summary\": \"The articles provide tips and strategies for effectively managing and paying off credit card debt, emphasizing the importance of being debt-free outside of mortgages and student loans. Methods such as the debt avalanche and debt snowball, as well as options like balance transfer credit cards, loans, and debt consolidation are discussed. Information on debt management programs, debt settlement, and bankruptcy as last resort options is also provided, stressing the importance of exploring all available assistance options and carefully considering the best course of action for individual financial situations. Factors to consider when choosing a method to pay off credit card debt include total debt, financial situation, credit score, and personal preferences. Tips on increasing monthly payments, negotiating lower interest rates, and monitoring progress are offered to help individuals pay off debt quickly and improve their financial situation. Additionally, improving credit scores involves paying off credit cards, keeping credit utilization low, and being mindful of factors like payment history and credit mix. Tips include changing credit card habits, cutting back on expenses, and being mindful of monthly bills to save money.\", \"tags\": \"\"}";
```

> Sample JSON Response 

```json
{
    "headline": "How to Pay off Credit Card Debt in 2024",
    "articleBody": "test",
    "description": "We know how easy it is to rack up credit card debt but getting out of it can be hard. Here's The Penny Hoarder's complete guide on how to pay off credit card debt.",
    "datePublished": "2023-02-20T15:35:07+00:00",
    "datePublishedRaw": "2023-02-20T15:35:07+00:00",
    "dateModified": "2024-05-13T18:35:55+00:00",
    "dateModifiedRaw": "2024-05-13T18:35:55+00:00",
    "authors": [
        {
            "name": "Janet Keeler",
            "nameRaw": "Janet Keeler"
        }
    ],
    "inLanguage": "en",
    "mainImage": {
        "url": "https://cdn.thepennyhoarder.com/wp-content/uploads/2019/08/19132958/DEBT-HOW-TO-PAY-CREDIT-CARDS-final.jpg"
    },
    "images": [
        {
            "url": "https://cdn.thepennyhoarder.com/wp-content/uploads/2019/07/05140024/Credit_Cards_Finance_001-300x200.jpg"
        },
        {
            "url": "https://cdn.thepennyhoarder.com/wp-content/uploads/2018/08/28140007/08-18-FB-DebtMethods-1-300x300.png"
        },
        {
            "url": "https://cdn.thepennyhoarder.com/wp-content/uploads/2022/03/14154759/pay-off-credit-card-debt-final.jpg"
        },
        {
            "url": "https://cdn.thepennyhoarder.com/wp-content/uploads/2019/08/19132958/DEBT-HOW-TO-PAY-CREDIT-CARDS-final.jpg"
        }
    ],
    "url": "https://www.thepennyhoarder.com/debt/how-to-pay-off-credit-card-debt/",
    "canonicalUrl": "https://www.thepennyhoarder.com/debt/how-to-pay-off-credit-card-debt/",
    "metadata": {
        "probability": 0.9678834080696106,
        "dateDownloaded": "2024-05-16T11:02:46Z"
    },
    "provided_url": [
        "https://wallethub.com/credit-cards/compare/"
    ],
    "root_domain": "https://www.thepennyhoarder.com",
    "s3": {
        "bucket": "ews-dev-logged-out-search-zyte",
        "key": "prod/current_article_items.json"
    },
    "dwh_timestamp": "2024-05-16T11:07:50.819Z",
    "publisherLogo": "https://cdn-search.dev-ews.engine.tech/publishers/thepennyhoarder.png",
    "publisherName": "The Penny Hoarder",
    "summary": "The articles provide tips and strategies for effectively managing and paying off credit card debt, emphasizing the importance of being debt-free outside of mortgages and student loans. Methods such as the debt avalanche and debt snowball, as well as options like balance transfer credit cards, loans, and debt consolidation are discussed. Information on debt management programs, debt settlement, and bankruptcy as last resort options is also provided, stressing the importance of exploring all available assistance options and carefully considering the best course of action for individual financial situations. Factors to consider when choosing a method to pay off credit card debt include total debt, financial situation, credit score, and personal preferences. Tips on increasing monthly payments, negotiating lower interest rates, and monitoring progress are offered to help individuals pay off debt quickly and improve their financial situation. Additionally, improving credit scores involves paying off credit cards, keeping credit utilization low, and being mindful of factors like payment history and credit mix. Tips include changing credit card habits, cutting back on expenses, and being mindful of monthly bills to save money.",
    "_type": "ArticleItem",
    "tags": ""
}
```
