package com.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class MyClass {
    public static void main(String args[]) throws IOException {

        System.out.println("start...");

        //newsPrase("http://zeenews.india.com/india", "Zeenews", "| Zee News","news_india", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/world", "Zeenews", "| Zee News","news_world", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/economy", "Zeenews", "| Zee News","news_india", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/markets", "Zeenews", "| Zee News","news_india", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/personal-finance", "Zeenews", "| Zee News","news_india", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/companies", "Zeenews", "| Zee News","news_business", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/international-business", "Zeenews", "| Zee News","news_business", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/real-estate", "Zeenews", "| Zee News","news_business", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/bullion", "Zeenews", "| Zee News","news_business", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/football", "Zeenews", "| Zee News","news_sports", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/tennis", "Zeenews", "| Zee News","news_sports", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/badminton", "Zeenews", "| Zee News","news_sports", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/other-sports", "Zeenews", "| Zee News","news_sports", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/apps", "Zeenews", "| Zee News","news_tech", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/gaming", "Zeenews", "| Zee News","news_tech", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/internet-social-media", "Zeenews", "| Zee News","news_tech", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/space", "Zeenews", "| Zee News","news_science", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/science", "Zeenews", "| Zee News","news_science", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/environment", "Zeenews", "| Zee News","news_science", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/discoveries", "Zeenews", "| Zee News","news_science", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/bollywood", "Zeenews", "| Zee News","news_india", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/television", "Zeenews", "| Zee News","news_ent", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/regional", "Zeenews", "| Zee News","news_india", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/movie-reviews", "Zeenews", "| Zee News","news_ent", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/people", "Zeenews", "| Zee News","news_india", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/relationships", "Zeenews", "| Zee News","news_ent", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/travel", "Zeenews", "| Zee News","news_lifestyle", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/food-recipes", "Zeenews", "| Zee News","news_lifestyle", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/fashion", "Zeenews", "| Zee News","news_ent", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/culture", "Zeenews", "| Zee News","news_lifestyle", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/spirituality", "Zeenews", "| Zee News","news_lifestyle", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/health", "Zeenews", "| Zee News","news_lifestyle", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/gadgets", "Zeenews", "| Zee News","news_gadget", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");
        //newsPrase("http://zeenews.india.com/mobiles", "Zeenews", "| Zee News","news_gadget", "section-article", "a", "first", "abs:href","english","","field-item","img","first","abs:src","class","field-item even","last","p");


        // newsPrase("http://www.deccanherald.com/contents/161/entertainment.html", "Deccanherald", "deccanherald","news_ent", "categoryNewsText", "a", "first", "abs:href","new_article_image","img","first","abs:src","class","brTOpStyle","first","false");
        // newsPrase("http://www.deccanherald.com/contents/158/international.html", "Deccanherald", "deccanherald","news_world", "categoryNewsText", "a", "first", "abs:href","new_article_image","img","first","abs:src","class","brTOpStyle","first","false");
        // newsPrase("http://www.deccanherald.com/contents/70/national.html", "Deccanherald", "deccanherald","news_ind", "categoryNewsText", "a", "first", "abs:href","new_article_image","img","first","abs:src","class","brTOpStyle","first","false");

        //newsPrase("http://aajtak.intoday.in/national.html", "Aajtak", "aajtak", "news_india", "v_sld", "a", "first", "abs:href", "hindi", "h1", "cinemaDetailBigImgSection", "img", "first", "abs:src", "itemprop", "articleBody", "first", "p");

        //newsPrase("https://khabar.ndtv.com/news/india?pfrom=home-khabar", "Aajtak", "aajtak", "news_india", "new_storylising_img", "a", "first", "abs:href", "hindi", "h1", "whosaid_top_mainimg_cont", "img", "first", "abs:src", "data-story-detials", "story", "first", "false");//no description

        //newsPrase("http://www.dnaindia.com/cricket", "Dnaindia", "Latest News & Updates at Daily News & Analysis", "news_cricket", "media-left", "a", "first", "abs:href", "english", "h1", "article-img", "img", "first", "abs:src", "class", "body-text", "first", "p");

        //newsPrase("http://timesofindia.indiatimes.com/business", "Timesofindia", "Times of India", "news_business", "w_tle", "a", "first", "abs:href", "english", "h1", "article-img", "img", "first", "abs:src", "class", "Normal", "first", "p");
        //newsPrase("http://timesofindia.indiatimes.com/life-style", "Timesofindia", "Times of India", "news_lifestyle", "w_tle", "a", "first", "abs:href", "english", "h1", "article-img", "img", "first", "abs:src", "class", "Normal", "first", "p");
        //newsPrase("http://timesofindia.indiatimes.com/sports", "Timesofindia", "Times of India", "news_sports", "w_tle", "a", "first", "abs:href", "english", "h1", "article-img", "img", "first", "abs:src", "class", "Normal", "first", "p");
        //newsPrase("http://timesofindia.indiatimes.com/india", "Timesofindia", "Times of India", "news_india", "w_tle", "a", "first", "abs:href", "english", "h1", "article-img", "img", "first", "abs:src", "class", "Normal", "first", "p");
        //newsPrase("http://timesofindia.indiatimes.com/world", "Timesofindia", "Times of India", "news_world", "w_tle", "a", "first", "abs:href", "english", "h1", "article-img", "img", "first", "abs:src", "class", "Normal", "first", "p");
        //newsPrase("http://timesofindia.indiatimes.com/entertainment/movie-reviews", "Timesofindia", "Times of India", "news_movie", "w_tle", "a", "first", "abs:href", "english", "h1", "article-img", "img", "first", "abs:src", "class", "Normal", "first", "p");


        //newsPrase("http://www.indiatimes.com/technology/", "Indiatimes", "Indiatimes.com", "news_tech", "caption", "a", "first", "abs:href", "english", "h1", "left-container", "img", "first", "abs:src", "class", "left-container pull-left", "first", "p");

        //newsPrase("https://www.pinkvilla.com/", "Pinkvilla", " | PINKVILLA", "news_ent", "celeb-article", "a", "first", "abs:href", "english", "h1", "article-main-image", "img", "first", "abs:src", "class", "article-page-body", "first", "p");

        //newsPrase("http://www.news18.com/india/", "News18", "News18", "news_india", "blog-list-blog", "a", "first", "abs:href", "english", "h1", "articleimg", "img", "last", "abs:srcset", "class", "hideCont clearfix paragraph", "first", "false");
        //newsPrase("http://www.news18.com/tech/", "News18", "News18", "news_tech", "blog-list-blog", "a", "first", "abs:href", "english", "h1", "articleimg", "img", "last", "abs:srcset", "class", "hideCont clearfix paragraph", "first", "false");
        //newsPrase("http://www.news18.com/movies/", "News18", "News18", "news_movie", "blog-list-blog", "a", "first", "abs:href", "english", "h1", "articleimg", "img", "last", "abs:srcset", "class", "hideCont clearfix paragraph", "first", "false");
        //newsPrase("http://www.news18.com/sports/", "News18", "News18", "news_sports", "blog-list-blog", "a", "first", "abs:href", "english", "h1", "articleimg", "img", "last", "abs:srcset", "class", "hideCont clearfix paragraph", "first", "false");
        //newsPrase("http://www.news18.com/politics/", "News18", "News18", "news_india", "blog-list-blog", "a", "first", "abs:href", "english", "h1", "articleimg", "img", "last", "abs:srcset", "class", "hideCont clearfix paragraph", "first", "false");

        //newsPrase("http://www.indiatvnews.com/india", "Indiatvnews", "News18", "news_india", "thumb", "a", "first", "abs:href", "english", "h1", "artbigimg", "img", "last", "abs:src", "class", "content", "first", "p");
        //newsPrase("http://www.indiatvnews.com/world", "Indiatvnews", "News18", "news_world", "thumb", "a", "first", "abs:href", "english", "h1", "artbigimg", "img", "last", "abs:src", "class", "content", "first", "p");
        //newsPrase("http://www.indiatvnews.com/entertainment", "Indiatvnews", "News18", "news_ent", "thumb", "a", "first", "abs:href", "english", "h1", "artbigimg", "img", "last", "abs:src", "class", "content", "first", "p");
        //newsPrase("http://www.indiatvnews.com/sports", "Indiatvnews", "News18", "news_sports", "thumb", "a", "first", "abs:href", "english", "h1", "artbigimg", "img", "last", "abs:src", "class", "content", "first", "p");
        //newsPrase("http://www.indiatvnews.com/business", "Indiatvnews", "News18", "news_business", "thumb", "a", "first", "abs:href", "english", "h1", "artbigimg", "img", "last", "abs:src", "class", "content", "first", "p");
        //newsPrase("http://www.indiatvnews.com/lifestyle", "Indiatvnews", "News18", "news_lifestyle", "thumb", "a", "first", "abs:href", "english", "h1", "artbigimg", "img", "last", "abs:src", "class", "content", "first", "p");

        //newsPrase("http://www.livemint.com/", "Livemint", "- Livemint", "news_tech", "intro-box-2", "a", "first", "abs:href", "english", "h1", "lead-image", "img", "last", "abs:src", "class", "content", "first", "p");

        //newsPrase("http://www.rvcj.com/category/entertainment/", "RVCJ Media", "RVCJ Media", "news_ent", "td-block-span6", "a", "first", "abs:href", "english", "h1", "td-modal-image", "img", "first", "abs:src", "class", "td-post-content", "first", "p");

        //newsPrase("http://www.thehindu.com/", "The Hindu", "- The Hindu", "news_india", "story-card-news", "a", "last", "abs:href", "english", "h1", "img-container", "img", "last", "abs:data-proxy-image", "class", "article", "first", "p");

        //newsPrase("http://www.deccanchronicle.com/entertainment", "Deccanchronicle", "deccanchronicle", "news_ent", "col-sm-4", "a", "first", "abs:href", "english", "h1", "cover", "img", "first", "abs:src", "id", "storyBody", "first", "p");
        //newsPrase("http://www.deccanchronicle.com/nation", "Deccanchronicle", "deccanchronicle", "news_india", "col-sm-4", "a", "first", "abs:href", "english", "h1", "cover", "img", "first", "abs:src", "id", "storyBody", "first", "p");
        //newsPrase("http://www.deccanchronicle.com/sports", "Deccanchronicle", "deccanchronicle", "news_sports", "col-sm-4", "a", "first", "abs:href", "english", "h1", "cover", "img", "first", "abs:src", "id", "storyBody", "first", "p");
        //newsPrase("http://www.deccanchronicle.com/technology", "Deccanchronicle", "deccanchronicle", "news_tech", "col-sm-4", "a", "first", "abs:href", "english", "h1", "cover", "img", "first", "abs:src", "id", "storyBody", "first", "p");
        //newsPrase("http://www.deccanchronicle.com/world", "Deccanchronicle", "deccanchronicle", "news_world", "col-sm-4", "a", "first", "abs:href", "english", "h1", "cover", "img", "first", "abs:src", "id", "storyBody", "first", "p");


        //newsPrase("http://www.hindustantimes.com/cricket/", "Hindustan Times", " | cricket | Hindustan Times", "news_cricket", "media-img", "a", "first", "abs:href", "english", "h1", "thumbnail", "img", "first", "abs:src", "class", "story-details", "first", "p");
        //newsPrase("http://www.hindustantimes.com/bollywood/top-news", "Hindustan Times", " | cricket | Hindustan Times", "news_ent", "media-img", "a", "first", "abs:href", "english", "h1", "thumbnail", "img", "first", "abs:src", "class", "story-details", "first", "p");
        //newsPrase("http://www.hindustantimes.com/top-news", "Hindustan Times", " | cricket | Hindustan Times", "news_india", "media-img", "a", "first", "abs:href", "english", "h1", "thumbnail", "img", "first", "abs:src", "class", "story-details", "first", "p");
        //newsPrase("http://www.hindustantimes.com/other-sports/", "Hindustan Times", " | cricket | Hindustan Times", "news_sports", "media-img", "a", "first", "abs:href", "english", "h1", "thumbnail", "img", "first", "abs:src", "class", "story-details", "first", "p");
        //newsPrase("http://www.hindustantimes.com/tennis/", "Hindustan Times", " | cricket | Hindustan Times", "news_sports", "media-img", "a", "first", "abs:href", "english", "h1", "thumbnail", "img", "first", "abs:src", "class", "story-details", "first", "p");
        //newsPrase("http://www.hindustantimes.com/football/", "Hindustan Times", " | cricket | Hindustan Times", "news_sports", "media-img", "a", "first", "abs:href", "english", "h1", "thumbnail", "img", "first", "abs:src", "class", "story-details", "first", "p");
        //newsPrase("http://www.hindustantimes.com/tech/gadget-news", "Hindustan Times", " | cricket | Hindustan Times", "news_tech", "media-img", "a", "first", "abs:href", "english", "h1", "thumbnail", "img", "first", "abs:src", "class", "story-details", "first", "p");
        //newsPrase("http://www.hindustantimes.com/world-news/", "Hindustan Times", " | cricket | Hindustan Times", "news_world", "media-img", "a", "first", "abs:href", "english", "h1", "thumbnail", "img", "first", "abs:src", "class", "story-details", "first", "p");
        //newsPrase("http://www.hindustantimes.com/tennis/", "Hindustan Times", " | cricket | Hindustan Times", "news_sports", "media-img", "a", "first", "abs:href", "english", "h1", "thumbnail", "img", "first", "abs:src", "class", "story-details", "first", "p");

        //newsPrase("http://www.cricbuzz.com/cricket-news", "Cricbuzz", "Cricbuzz.com", "news_cricket", "cb-lst-itm-lg", "a", "first", "abs:href", "english", "h1", "horizontal-img-container", "img", "first", "abs:src", "class", "story-details", "first", "p");

        //newsPrase("http://indianexpress.com/section/entertainment/bollywood/", "IndianExpress", " | The Indian Express", "news_tech", "snaps", "a", "first", "abs:href", "english", "h1", "custom-caption", "img", "first", "abs:src", "class", "full-details", "first", "p");
        //newsPrase("http://indianexpress.com/section/entertainment/hollywood/", "IndianExpress", " | The Indian Express", "news_tech", "snaps", "a", "first", "abs:href", "english", "h1", "custom-caption", "img", "first", "abs:src", "class", "full-details", "first", "p");
        //newsPrase("http://indianexpress.com/section/india/", "IndianExpress", " | The Indian Express", "news_india", "snaps", "a", "first", "abs:href", "english", "h1", "custom-caption", "img", "first", "abs:src", "class", "full-details", "first", "p");
        //newsPrase("http://indianexpress.com/section/sports/football/", "IndianExpress", " | The Indian Express", "news_sports", "snaps", "a", "first", "abs:href", "english", "h1", "custom-caption", "img", "first", "abs:src", "class", "full-details", "first", "p");

    }


    /**
     * @param Url
     * @param sourename
     * @param replacablename
     * @param newsCatagory
     * @param ClassNameOfLinks-The         classname from where the href links will collect.By default order is first
     * @param tagNameOfLink
     * @param orderOfTag
     * @param attributeNameOfLink
     * @param headingLanguage-language     of heading
     * @param tagNameOfHeading-ex:h1
     * @param classNameOfImage-The         classname from where the main image link will collect..By default order is first
     * @param tagNameOfImage
     * @param orderOfTag1
     * @param attributeNameOfImage
     * @param descriptionAttributeName-In  others it is class
     * @param descriptionAttributeValue-In others it is className
     * @param descriptionAttributeOrder-In others it is first.
     * @param tagNameOfDescription-if      no tag then false
     * @throws IOException
     */
    public static void newsPrase(String Url, String sourename, String replacablename, String newsCatagory, String ClassNameOfLinks, String tagNameOfLink, String orderOfTag, String attributeNameOfLink, String headingLanguage, String tagNameOfHeading, String classNameOfImage, String tagNameOfImage, String orderOfTag1, String attributeNameOfImage, String descriptionAttributeName, String descriptionAttributeValue, String descriptionAttributeOrder, String tagNameOfDescription) throws IOException {

        Document document = null;
        try {
            document = Jsoup.connect(Url).timeout(100000).userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:5.0) Gecko/20100101 Firefox/5.0").get();

            Elements bodyElements = document.select("body");

            for (Element bodyElement : bodyElements) {

                /**
                 * getting all links from a url
                 */
                Elements singlePageElements = bodyElement.getElementsByClass(ClassNameOfLinks);//getting the main page by classname
                for (Element singlePageElement : singlePageElements) {
                    try {
                        Element link = null;
                        if (orderOfTag.equals("first")) {
                            link = singlePageElement.select(tagNameOfLink).first();
                        } else if (orderOfTag.equals("last")) {
                            link = singlePageElement.select(tagNameOfLink).last();
                        }
                        String singlepagelink = link.attr(attributeNameOfLink);
                        System.out.println("singlepagelink: " + singlepagelink);

                        /**
                         * getting document from singlepagelink
                         */
                        Document singlepage = Jsoup.connect(singlepagelink).timeout(100000).userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:5.0) Gecko/20100101 Firefox/5.0").get();
                        //System.out.println(singlepage);
                        /**
                         * getting title of the singlepage
                         */
                        String titlebeforeremove = null;
                        if (headingLanguage.equals("english"))
                            titlebeforeremove = singlepage.title();
                        else {
                            Element h1 = singlepage.getElementsByTag(tagNameOfHeading).first();
                            titlebeforeremove = h1.text();
                        }
                        String title = titlebeforeremove.replace(replacablename, "");
                        System.out.println("title: " + title);


                        /**
                         * getting image of the singlepage
                         */
                        Element elementsrc = singlepage.getElementsByClass(classNameOfImage).first();
                        Element elementsrc1 = null;
                        if (orderOfTag1.equals("first")) {
                            elementsrc1 = elementsrc.select(tagNameOfImage).first();
                        } else if (orderOfTag1.equals("last")) {
                            elementsrc1 = elementsrc.select(tagNameOfImage).last();
                        }
                        String imgsrcfrompage = elementsrc1.attr(attributeNameOfImage);
                        System.out.println("imgsrcfrompage: " + imgsrcfrompage);


                        /**
                         * getting description of the singlepage
                         */
                        Element elementdescription = null;
                        Elements elementdescription1 = null;
                        String description = null;
                        if (descriptionAttributeOrder.equals("first")) {
                            elementdescription = singlepage.getElementsByAttributeValue(descriptionAttributeName, descriptionAttributeValue).first();
                        } else if (descriptionAttributeOrder.equals("last")) {
                            elementdescription = singlepage.getElementsByAttributeValue(descriptionAttributeName, descriptionAttributeValue).last();
                        }
                        if (tagNameOfDescription.equals("false")) {
                            description = elementdescription.text();
                        } else {
                            elementdescription1 = elementdescription.getElementsByTag(tagNameOfDescription);
                            description = elementdescription1.text();
                        }
                        String description1 = description.toString().trim();
                        String description2 = description1.replace("\"", "-");
                        String description3 = description2.replace("'", "");
                        System.out.println("description: " + description3);

                        /**
                         * sending to database
                         */
                        //sendDataToDatabase(singlepagelink, sourename, title, imgsrcfrompage, newsCatagory, description3);

                    } catch (java.lang.Exception e1) {
                         System.out.println("Exception occures"+e1);

                    }
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    /*
    public static void newsPrase(String mainPageUrl, String sourename, String newsCatagory, String hrefAttributeOrder, String hefClassName, String replacablename, String headingType, String headingName, String srcClassName, String imageAttributeOder, String imageAttributeName, String descriptionAttributeName, String descriptionAttributeValue, String descriptionAttributeOrder, String tagNameP) throws IOException {

        Document document = null;
        try {
            document = Jsoup.connect(mainPageUrl).timeout(100000).userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:5.0) Gecko/20100101 Firefox/5.0").get();

            Elements links = document.select("body");
            for (Element link1 : links) {
                Elements content = link1.getElementsByClass(hefClassName);//getting the main page by classname
                for (Element e : content) {
                    try {
                        Element link = null;
                        if (hrefAttributeOrder.equals("first")) {
                            link = e.select("a").first();
                        } else if (hrefAttributeOrder.equals("last")) {
                            link = e.select("a").last();
                        }
                        String singlepagelink = link.attr("abs:href");
                        // System.out.println(singlepagelink);

                        Document singlepage = Jsoup.connect(singlepagelink).timeout(100000).userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:5.0) Gecko/20100101 Firefox/5.0").get();
                        Element elementtitle = null;
                        if (headingType.equals("headingTagName")) {
                            elementtitle = singlepage.getElementsByTag(headingName).first();
                        } else if (headingType.equals("headingClassName")) {
                            elementtitle = singlepage.getElementsByClass(headingName).first();
                        }
                        String title = elementtitle.text();
                        //System.out.println(title);

                        Element elementsrc = singlepage.getElementsByClass(srcClassName).first();
                        Element elementsrc1 = null;
                        if (imageAttributeOder.equals("first")) {
                            elementsrc1 = elementsrc.select("img").first();
                        } else if (imageAttributeOder.equals("last")) {
                            elementsrc1 = elementsrc.select("img").last();
                        }
                        String imgsrcfrompage = elementsrc1.attr(imageAttributeName);
                        //System.out.println(imgsrcfrompage);

                        Element elementdescription = null;
                        Elements elementdescription1 = null;
                        String description = null;
                        if (descriptionAttributeOrder.equals("first")) {
                            elementdescription = singlepage.getElementsByAttributeValue(descriptionAttributeName, descriptionAttributeValue).first();
                        } else if (descriptionAttributeOrder.equals("last")) {
                            elementdescription = singlepage.getElementsByAttributeValue(descriptionAttributeName, descriptionAttributeValue).last();
                        }
                        if (tagNameP.equals("true")) {
                            elementdescription1 = elementdescription.getElementsByTag("p");
                            description = elementdescription1.text();
                        } else if (tagNameP.equals("false")) {
                            description = elementdescription.text();
                        }
                        // System.out.println("description"+description + "\n");

                        String description1 = description.toString().trim();
                        String description2 = description1.replace("\"", "-");
                        String description3 = description2.replace("'", "");

                        //System.out.println("afterremoval desc"+finaldescription);
                        //sendDataToDatabase(singlepagelink, sourename, title, imgsrcfrompage, newsCatagory, description3);

                    } catch (java.lang.Exception e1) {
                        // System.out.println("img=null");

                    }
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    */



    /*


    1)webpage link
    2)give classname to find ahref
    3)weather a is present in first order or seond order
    ...no need to give href
    4)Get all href links
    5)From the above href link give classname to find the main image links.
    6)weather img is present in first order or seond order
    7)need of abs:src
    8)give attributename ,attribute value and order where paragraph is located


     */

}
