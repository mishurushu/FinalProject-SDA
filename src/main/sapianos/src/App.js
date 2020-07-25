import React from 'react';
import './App.css';
import NavigationBar from "./components/NavigationBar";
import Footer from "./components/Footer";
import SearchProduct from "./components/SearchProduct";
import PostProduct from "./components/PostProduct";
import Inbox from "./components/Inbox";
import {Container,Row,Col} from 'react-bootstrap';
import {BrowserRouter as Router, Switch,Route} from 'react-router-dom'
import Welcome from "./components/Welcome";
import Profile from "./components/Profile";

function App() {
    const marginTop ={
        marginTop:"20px"
    }

  return (
    <Router>
        <NavigationBar/>
        <Container>
            <Row>
                <Col lg={12} style={marginTop}>
                    <Switch>
                        <Route path="/welcome" exact component={Welcome}/>
                        <Route path="/list" exact component={SearchProduct}/>
                        <Route path="/add" exact component={PostProduct}/>
                        <Route path="/inbox" exact component={Inbox}/>
                        <Route path="/profile" exact component={Profile}/>
                    </Switch>
                </Col>
            </Row>
        </Container>
        <Footer/>
    </Router>
  );
}

export default App;
