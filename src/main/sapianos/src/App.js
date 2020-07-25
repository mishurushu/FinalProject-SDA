import React from 'react';
import './App.css';
import NavigationBar from "./components/NavigationBar";
import Footer from "./components/Footer";
import {Container,Row,Jumbotron,Col} from 'react-bootstrap';

function App() {
    const marginTop ={
        marginTop:"20px"
    }

  return (
    <div className="App">
        <NavigationBar></NavigationBar>
        <Container>
            <Row>
                <Col lg={12} style={marginTop}>
                <Jumbotron className="bg-dark text-white">
                    <Jumbotron className="bg-dark text-white">
                        <h1>Welcome to SappianoS!</h1>
                    </Jumbotron>
                </Jumbotron>
                </Col>
            </Row>
        </Container>
        <Footer/>
    </div>
  );
}

export default App;
