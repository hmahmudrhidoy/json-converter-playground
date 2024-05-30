package com.codemechanix.jsonconverter.dto.os;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public class ArticleItem {
    @JsonProperty("headline")
    private String headline;

    @JsonProperty("articleBody")
    private String articleBody;

    @JsonProperty("description")
    private String description;

    @JsonProperty("datePublished")
    private String datePublished;

    @JsonProperty("datePublishedRaw")
    private String datePublishedRaw;

    @JsonProperty("dateModified")
    private String dateModified;

    @JsonProperty("dateModifiedRaw")
    private String dateModifiedRaw;

    @JsonProperty("authors")
    private List<Author> authors;

    @JsonProperty("inLanguage")
    private String inLanguage;

    @JsonProperty("mainImage")
    private MainImage mainImage;

    @JsonProperty("images")
    private List<Image> images;

    @JsonProperty("url")
    private String url;

    @JsonProperty("canonicalUrl")
    private String canonicalUrl;

    @JsonProperty("metadata")
    private Metadata metadata;

    @JsonProperty("provided_url")
    private List<String> providedUrl;

    @JsonProperty("root_domain")
    private String rootDomain;

    @JsonProperty("s3")
    private S3 s3;

    @JsonProperty("dwh_timestamp")
    private String dwhTimestamp;

    @JsonProperty("publisherLogo")
    private String publisherLogo;

    @JsonProperty("publisherName")
    private String publisherName;

    @JsonProperty("summary")
    private String summary;

    @JsonProperty("_type")
    private String type;

    @JsonProperty("tags")
    private String tags;

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getArticleBody() {
        return articleBody;
    }

    public void setArticleBody(String articleBody) {
        this.articleBody = articleBody;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public String getDatePublishedRaw() {
        return datePublishedRaw;
    }

    public void setDatePublishedRaw(String datePublishedRaw) {
        this.datePublishedRaw = datePublishedRaw;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    public String getDateModifiedRaw() {
        return dateModifiedRaw;
    }

    public void setDateModifiedRaw(String dateModifiedRaw) {
        this.dateModifiedRaw = dateModifiedRaw;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public String getInLanguage() {
        return inLanguage;
    }

    public void setInLanguage(String inLanguage) {
        this.inLanguage = inLanguage;
    }

    public MainImage getMainImage() {
        return mainImage;
    }

    public void setMainImage(MainImage mainImage) {
        this.mainImage = mainImage;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCanonicalUrl() {
        return canonicalUrl;
    }

    public void setCanonicalUrl(String canonicalUrl) {
        this.canonicalUrl = canonicalUrl;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public List<String> getProvidedUrl() {
        return providedUrl;
    }

    public void setProvidedUrl(List<String> providedUrl) {
        this.providedUrl = providedUrl;
    }

    public String getRootDomain() {
        return rootDomain;
    }

    public void setRootDomain(String rootDomain) {
        this.rootDomain = rootDomain;
    }

    public S3 getS3() {
        return s3;
    }

    public void setS3(S3 s3) {
        this.s3 = s3;
    }

    public String getDwhTimestamp() {
        return dwhTimestamp;
    }

    public void setDwhTimestamp(String dwhTimestamp) {
        this.dwhTimestamp = dwhTimestamp;
    }

    public String getPublisherLogo() {
        return publisherLogo;
    }

    public void setPublisherLogo(String publisherLogo) {
        this.publisherLogo = publisherLogo;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}