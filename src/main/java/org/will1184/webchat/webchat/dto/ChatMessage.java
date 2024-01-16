package org.will1184.webchat.webchat.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChatMessage {
    String message;
    String user;
}
