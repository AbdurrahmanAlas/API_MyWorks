
Feature: As an administrator, I want to be able to create FAQ's and access FAQ's details via API connection.
       # Bir yönetici olarak API baglantisi üzerinden FAQ's olusturabilmek ve FAQ's detaylarina erisebilmek istiyorum.



  Scenario: APIUS_007 -->TC_007_01 When a POST body containing valid authorization information and necessary information is sent to the /api/faqsAdd endpoint, it should be verified that the status code returned is 201 and the message information in the response body is "Faqs added successfully".
      # /api/faqsAdd endpoint'ine gecerli
        # authorization bilgileri ve gerekli bilgileri iceren bir
          # POST body gönderildiginde dönen
            # status code'in 201 ve response body'deki
               # message bilgisinin "Faqs added successfully"
                 # oldugu dogrulanmali.

    * "api,faqsAdd" sets path parameters
    * Enters email and password.
    * Request method POST
    * Response Code 201
    * Response Message "Faqs added successfully"