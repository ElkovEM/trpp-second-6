package ru.mirea.trppsecond.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.opencsv.bean.CsvBindByName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/** Сущность сообщения. */
@Getter
@Setter
@ToString
public class Message {

    /** identifier. */
    @JsonProperty("id")
    @CsvBindByName(column = "id")
    private Long id;
    /** identifier of sender. */
    @JsonProperty("sender_id")
    @CsvBindByName(column = "sender_id")
    private String senderId;
    /** identifier of receiver. */
    @JsonProperty("receiver_id")
    @CsvBindByName(column = "receiver_id")
    private String receiverId;
    /** Текст. */
    @JsonProperty("text")
    @CsvBindByName(column = "text")
    private String text;
    /** Дата отправки. */
    @JsonProperty("created")
    @CsvBindByName(column = "created")
    private String created;

}
