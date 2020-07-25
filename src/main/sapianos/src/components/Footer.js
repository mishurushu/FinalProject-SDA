import React from 'react';

import {Navbar,Container, Col} from  'react-bootstrap'

class Footer extends  React.Component{
  render(){
      let fullYear = new Date().getFullYear();
      //TO DO - contact
     // let contact = new Contact;

      return (
          <Navbar fixed="bottom" bg="dark" variant="dark">
              <Container>
              <Col>
                  <div> {fullYear}-{fullYear+1} All Rights Reserved by SapianoS</div>
              </Col>
              </Container>
          </Navbar>
      )
  }
}

export default Footer;