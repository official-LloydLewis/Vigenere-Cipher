# Vigenere Cipher

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-blue.svg)


## Description

This Java program implements the Vigenere Cipher, a method of encrypting alphabetic text using a simple form of polyalphabetic substitution. The cipher uses a keyword to shift each letter of the plaintext by a number of positions determined by the corresponding letter in the keyword.

### Features

- **Encryption:** Encrypts plaintext using the Vigenere Cipher technique.
- **Decryption:** Decrypts ciphertext back to the original plaintext.
- **Case Insensitivity:** Handles both uppercase and lowercase letters seamlessly.
- **Non-Alphabetic Character Handling:** Preserves non-alphabetic characters (e.g., spaces, punctuation) in the text.

## About Project

The Vigenere Cipher is a method of encrypting alphabetic text by using a simple form of polyalphabetic substitution. The technique was first described by Giovan Battista Bellaso in 1553, but it was later misattributed to Blaise de Vigenere in the 19th century, hence the name.

### How It Works

The Vigenere Cipher uses a keyword to shift each letter of the plaintext by a number of positions determined by the corresponding letter in the keyword. The process involves:

1. **Key Repetition:** The keyword is repeated to match the length of the plaintext.
2. **Shifting Letters:** Each letter of the plaintext is shifted along the alphabet by the number of positions indicated by the corresponding letter of the repeated keyword. For example, if the keyword letter is 'B' (which is the second letter of the alphabet), each letter of the plaintext will be shifted by two positions.

- **Encryption Example**
```text
Plaintext: H E L L O
Key: K E Y K E
```
Shift each letter of the plaintext by the position of the corresponding letter in the keyword:
- H shifted by K (10 positions) becomes R
- E shifted by E (4 positions) becomes I
- L shifted by Y (24 positions) becomes J
- L shifted by K (10 positions) becomes V
- O shifted by E (4 positions) becomes S

**So, "HELLO" encrypted with the keyword
"KEY" becomes "RIJVS".**


- **Decryption  Example**
```text
Plaintext: H E L L O
Key: K E Y K E
```

To decrypt the ciphertext "RIJVS" with the keyword "KEY":
Repeat the keyword to match the length of the ciphertext:


Shift each letter of the ciphertext backward by the position of the corresponding letter in the keyword:
- R shifted backward by K (10 positions) becomes H
- I shifted backward by E (4 positions) becomes E
- J shifted backward by Y (24 positions) becomes L
- V shifted backward by K (10 positions) becomes L
- S shifted backward by E (4 positions) becomes O

**So, "RIJVS" decrypted with the keyword 
"KEY" becomes "HELLO".**



### Strengths and Weaknesses

- **Strengths:**
- Resistant to frequency analysis attacks compared to simple substitution ciphers.
- Easy to implement and use with a keyword.

- **Weaknesses:**
- Vulnerable to Kasiski examination and other forms of cryptanalysis if the keyword is short or if the ciphertext is long.

The Vigenere Cipher, while historically significant and interesting, is not secure by modern standards. It serves as an excellent educational tool to understand the basics of polyalphabetic substitution ciphers and the evolution of cryptographic techniques.





### Decryption Example

To decrypt the ciphertext "RIJVS" with the keyword "KEY":

1. Repeat the keyword to match the length of the ciphertext:


  
### Encryption Example

Let's encrypt the plaintext "HELLO" with the keyword "KEY":

1. Repeat the keyword to match the length of the plaintext:


## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your system.

### Installation

1. **Clone the Repository:**
   ```sh
   git clone https://github.com/yourusername/VigenereCipher.git
   ```

### Navigate to the Project Directory

- cd VigenereCipher

###  Compile the Java Files

- javac VigenereCipher.java

### Usage

- Run the program with the following command
 ```text
 java VigenereCipher
 ```

### License

- ***This project is licensed under the MIT License***
